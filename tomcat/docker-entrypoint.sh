#!/bin/sh

set -ex

if [ ! -d /logs ]; then
    mkdir -p /logs
fi

if [ ! -d "${TOMCAT_HOME}/webapps/manager" ]; then
    cp -r ${TOMCAT_HOME}/webapps.origin/* ${TOMCAT_HOME}/webapps/
fi

if [ ! -f "${TOMCAT_HOME}/conf/server.xml" ]; then
    cp -r ${TOMCAT_HOME}/conf.origin/* ${TOMCAT_HOME}/conf/
fi

# Do pre-configurations here
#

exec "$@"
