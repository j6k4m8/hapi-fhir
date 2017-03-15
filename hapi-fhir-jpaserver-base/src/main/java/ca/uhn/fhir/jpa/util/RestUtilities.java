/*
 *  Copyright 2017 Cognitive Medical Systems, Inc (http://www.cognitivemedicine.com).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package ca.uhn.fhir.jpa.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.hl7.fhir.convertor.dstu3.formats.IParser;
import org.hl7.fhir.convertor.dstu3.formats.JsonParser;
import org.hl7.fhir.convertor.dstu3.model.Resource;

import javax.xml.ws.http.HTTPException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Rest service utilities. Generally used in the tests
 */
public class RestUtilities {

	public static final String CONTEXT_PATH = "";
	public static final String APPLICATION_JSON = "application/json";

	/**
	 * Get the response for a CXF REST service without an object parameter
	 * 
	 * @param url
	 * @param typeRequest
	 * @return
	 * @throws IOException
	 */
	public static String getResponse(String url, MethodRequest typeRequest) throws IOException {
		return getResponse(url, (StringEntity) null, typeRequest);
	}

	public static String getAsDstu3JsonString(Resource resource) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		JsonParser json1 = new JsonParser();
		json1.setOutputStyle(IParser.OutputStyle.PRETTY);
		json1.compose(out, resource);
		out.close();

		return out.toString();
	}

	public static String getAsDstu2JsonString(org.hl7.fhir.converter.dstu2.model.Resource resource) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		org.hl7.fhir.converter.dstu2.formats.JsonParser json1 = new org.hl7.fhir.converter.dstu2.formats.JsonParser();
		json1.setOutputStyle(org.hl7.fhir.converter.dstu2.formats.IParser.OutputStyle.PRETTY);
		json1.compose(out, resource);
		out.close();

		return out.toString();
	}

	public static String getResponse(String url, org.hl7.fhir.converter.dstu2.model.Resource resource, MethodRequest typeRequest) throws IOException {
		String stringObject = getAsDstu2JsonString(resource);
		StringEntity parameterEntity = new StringEntity(stringObject);

		return getResponse(url, parameterEntity, typeRequest);
	}

	public static String getResponse(String url, Resource resource, MethodRequest typeRequest) throws IOException {
		String stringObject = getAsDstu3JsonString(resource);
		StringEntity parameterEntity = new StringEntity(stringObject);

		return getResponse(url, parameterEntity, typeRequest);
	}

	/**
	 * Get the response for a CXF REST service with an object parameter
	 * 
	 * @param url
	 * @param parameterEntity
	 * @param typeRequest
	 * @return
	 * @throws IOException
	 */
	public static String getResponse(String url, StringEntity parameterEntity, MethodRequest typeRequest) throws IOException {
		HttpClient httpclient = new DefaultHttpClient();
		HttpResponse response;

		switch (typeRequest) {
		case POST:
			HttpPost httppost = new HttpPost(url);
			httppost.setHeader("Content-type", APPLICATION_JSON);
			if (parameterEntity != null) {
				httppost.setEntity(parameterEntity);
			}
			response = httpclient.execute(httppost);
			break;
		case PUT:
			HttpPut httpPut = new HttpPut(url);
			httpPut.setHeader("Content-type", APPLICATION_JSON);
			if (parameterEntity != null) {
				httpPut.setEntity(parameterEntity);
			}
			response = httpclient.execute(httpPut);
			break;
		case DELETE:
			HttpDelete httpDelete = new HttpDelete(url);
			httpDelete.setHeader("Content-type", APPLICATION_JSON);
			response = httpclient.execute(httpDelete);
			break;
		case GET:
			HttpGet httpGet = new HttpGet(url);
			httpGet.setHeader("Content-type", APPLICATION_JSON);
			response = httpclient.execute(httpGet);
			break;
		default:
			throw new IllegalArgumentException("Cannot handle type request " + typeRequest);
		}

		if (response.getStatusLine().getStatusCode() < 200 || response.getStatusLine().getStatusCode() >= 300) {
			throw new HTTPException(response.getStatusLine().getStatusCode());
		}

		if (response.getStatusLine().getStatusCode() == 204) {
			return "";
		}

        //Closes connections that have already been closed by the server
        //org.apache.http.NoHttpResponseException: The target server failed to respond
        httpclient.getConnectionManager().closeIdleConnections(1, TimeUnit.SECONDS);

		return EntityUtils.toString(response.getEntity());
	}
}