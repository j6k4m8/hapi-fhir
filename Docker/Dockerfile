FROM openjdk:8-jre

LABEL maintainer="Harold Solbrig <solbrig@jhu.edu>"
LABEL version="0.1.0"

# The internal port and external port must be the same, as port #'s are included in some of the dynamic html
ENV PORT 8080

RUN apt-get update && \
    apt-get install -y git && \
    apt-get install -y curl

RUN apt-get install -y apt-file && \
    apt-file update  &&  \
    apt-get install vim -y

RUN curl -L https://github.com/NCATS-Tangerine/hapi-fhir/releases/download/v3.7.0ebmonfhir/hapi-fhir-cli > hapi-fhir-cli
RUN curl -L https://github.com/NCATS-Tangerine/hapi-fhir/releases/download/v3.7.0ebmonfhir/hapi-fhir-cli.jar > hapi-fhir-cli.jar
RUN chmod +x hapi-fhir-cli

# disable-referential-integrity  - Allow resources to be entered even when the resources they reference don't exist
# allow-external-refs - Allow resources to contain references to resources outside of the current system
ENTRYPOINT ./hapi-fhir-cli run-server -v r4 --allow-external-refs --disable-referential-integrity -p $PORT
