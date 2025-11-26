ARG ALPINE_VERSION=3.20
FROM alpine:${ALPINE_VERSION}
MAINTAINER nexttop <hossjava@osxx.com>
LABEL Description="Lightweight container with Maven based on Alpine Linux."

ARG JDK_VERSION
ENV JDK_VERSION=${JDK_VERSION}

RUN apk update && apk add \
	make \
	openjdk${JDK_VERSION}-jdk \
	maven \
	&& rm -rf /tmp/* /var/cache/apk/*

WORKDIR /data

COPY docker-entrypoint.sh /entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]

CMD ["tail", "-f", "/dev/null"]
