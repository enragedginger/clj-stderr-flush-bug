#!/bin/bash
docker build -t stderr-flush-bug .
docker run -it --rm --name stderr-flush-bug stderr-flush-bug
