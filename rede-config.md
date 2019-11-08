Fixar os IP das maquinas

CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                    NAMES
4472c9a2aefd        openjdk:11-jdk      "sh -c 'java -jar Sp…"   8 hours ago         Up 3 minutes        0.0.0.0:8082->8082/tcp   java8_app_1
55ea70712133        nginx               "nginx -g 'daemon of…"   8 hours ago         Up 8 hours          0.0.0.0:3000->80/tcp     nginx_app_1
e6e736815374        adminer             "entrypoint.sh docke…"   9 hours ago         Up 9 hours          0.0.0.0:8080->8080/tcp   postgresql_adminer_1
916ef644a7fc        postgres            "docker-entrypoint.s…"   9 hours ago         Up 9 hours          0.0.0.0:5432->5432/tcp   postgresql_db_1

"Containers": {
            "4472c9a2aefdd82a8ba3fac6d63a0a88dae1c5decdef44dc0d07484bfddb232d": {
                "Name": "java8_app_1",
                "EndpointID": "3bdae1ee33b4ee94e75dcb589cf40c1a3da2ef0e7a25519b4e7f552ab360154d",
                "MacAddress": "02:42:ac:1a:00:05",
                "IPv4Address": "172.26.0.5/16",
                "IPv6Address": ""
            },
            "55ea70712133ba2f25de3f3cc2ec741c2d2863408773c69c00c4b30dc30b5137": {
                "Name": "nginx_app_1",
                "EndpointID": "1cfec98e9b8be012d6a4f5fe3f1b58fa657e28062da15b642813ada8d7d2d08e",
                "MacAddress": "02:42:ac:1a:00:04",
                "IPv4Address": "172.26.0.4/16",
                "IPv6Address": ""
            },
            "916ef644a7fc426f0a1ae317d4641eff363e9dda6d8597a05c49c8f4d3f1bae9": {
                "Name": "postgresql_db_1",
                "EndpointID": "d398db5383a013fa00818535b4f6cc5642a325ad601e562419f6890945ca8c01",
                "MacAddress": "02:42:ac:1a:00:02",
                "IPv4Address": "172.26.0.2/16",
                "IPv6Address": ""
            },
            "e6e7368153748e6f1541c7486b4619ca46d68eac3d6a168a63eae964023210f1": {
                "Name": "postgresql_adminer_1",
                "EndpointID": "9969edff11bf98fd7c5bccc85b4a17d1be9bb7b7efb97dec5e5bed66e623f0db",
                "MacAddress": "02:42:ac:1a:00:03",
                "IPv4Address": "172.26.0.3/16",
                "IPv6Address": ""
            }
        },
        "Options": {},
        "Labels": {
            "com.docker.compose.network": "rede-local",
            "com.docker.compose.project": "postgresql"
        }
