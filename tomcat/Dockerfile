ARG ALPINE_VERSION=3.20
FROM alpine:${ALPINE_VERSION}
MAINTAINER nexttop <javahoss@osxx.com>
LABEL Description="Lightweight container with Tomcat based on Alpine Linux."

ARG TOMCAT_MAJOR
ENV TOMCAT_MAJOR=${TOMCAT_MAJOR}
ARG TOMCAT_VERSION
ENV TOMCAT_VERSION=${TOMCAT_VERSION}
ARG TOMCAT_HOME
ENV TOMCAT_HOME=${TOMCAT_HOME}
ARG CATALINA_HOME
ENV CATALINA_HOME=${CATALINA_HOME}
ARG CATALINA_OUT
ENV CATALINA_OUT=${CATALINA_OUT}

RUN apk update && apk add curl \
   openjdk8-jre \
    && curl -jksSL -o /tmp/apache-tomcat.tar.gz http://archive.apache.org/dist/tomcat/tomcat-${TOMCAT_MAJOR}/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz \
    && gunzip /tmp/apache-tomcat.tar.gz \
    && tar -C /opt -xf /tmp/apache-tomcat.tar \
    && ln -s /opt/apache-tomcat-${TOMCAT_VERSION} ${TOMCAT_HOME} \
    && mv ${TOMCAT_HOME}/webapps ${TOMCAT_HOME}/webapps.origin \
    #&& rm -rf ${TOMCAT_HOME}/webapps/* \
    && apk del curl \
    && rm -rf /tmp/* /var/cache/apk/*


COPY config/logging.properties ${TOMCAT_HOME}/conf/logging.properties
COPY config/server.xml ${TOMCAT_HOME}/conf/server.xml
COPY config/tomcat-users.xml ${TOMCAT_HOME}/conf/tomcat-users.xml

RUN mv ${TOMCAT_HOME}/conf ${TOMCAT_HOME}/conf.origin

WORKDIR ${TOMCAT_HOME}/webapps
EXPOSE 8080

COPY docker-entrypoint.sh /entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]

CMD ["/opt/tomcat/bin/catalina.sh","run"]