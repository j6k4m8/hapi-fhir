package org.hl7.fhir.r4.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Apr 16, 2019 08:42-0500 for FHIR v4.1.0


import org.hl7.fhir.exceptions.FHIRException;

public enum ClinicalProfileStatus {

        /**
         * The report is complete and ready for use.
         */
        COMPLETE, 
        /**
         * A report is available but it hasn't vbeen verified.
         */
        DRAFT, 
        /**
         * The report is not to be used because some sort of error has occurred.
         */
        ERROR, 
        /**
         * added to help the parsers
         */
        NULL;
        public static ClinicalProfileStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("error".equals(codeString))
          return ERROR;
        throw new FHIRException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case COMPLETE: return "complete";
            case DRAFT: return "draft";
            case ERROR: return "error";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/clinical-profile-status";
        }
        public String getDefinition() {
          switch (this) {
            case COMPLETE: return "The report is complete and ready for use.";
            case DRAFT: return "A report is available but it hasn't vbeen verified.";
            case ERROR: return "The report is not to be used because some sort of error has occurred.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case COMPLETE: return "Complete";
            case DRAFT: return "Draft";
            case ERROR: return "Error";
            default: return "?";
          }
    }


}

