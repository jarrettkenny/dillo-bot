#!/bin/sh

ssh -i key/dillo-key.pem $USER@$HOST <<- ENDSSH
    docker kill dillo_bot

    exit
ENDSSH