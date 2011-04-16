#!/bin/bash

pushd ../stock-positions-database
mvn clean install flyway:clean flyway:init flyway:migrate

pushd ../stock-positions
mvn clean install 

pushd ../stock-positions-acceptance
mvn clean install -P acceptance-tests

