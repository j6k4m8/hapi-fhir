from openjdk

LABEL maintainer="Harold Solbrig <solbrig@jhu.edu>"
LABEL version="0.1.0"

RUN apt-get -y update
RUN apt-get install -y git
RUN apt-get install -y curl

RUN apt-get update -y
RUN apt-get install apt-file -y
RUN apt-file update 
RUN apt-get install vim -y

RUN curl -L https://github.com/NCATS-Tangerine/hapi-fhir/releases/download/v3.7.0ebmonfhir/hapi-fhir-cli > hapi-fhir-cli
RUN curl -L https://github.com/NCATS-Tangerine/hapi-fhir/releases/download/v3.7.0ebmonfhir/hapi-fhir-cli.jar > hapi-fhir-cli.jar
RUN chmod +x hapi-fhir-cli

# This exposes port 8080 -- map accordingly
# disable-referential-integrity  - Allow resources to be entered even when the resources they reference don't exist
# allow-external-refs - Allow resources to contain references to resources outside of the current system
ENTRYPOINT ./hapi-fhir-cli run-server -v r4 --allow-external-refs --disable-referential-integrity 
