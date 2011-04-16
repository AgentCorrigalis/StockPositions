#!/bin/bash

pushd ../stock-positions
mvn clean install -Dmaven.test.skip=true

pushd ../stock-positions-acceptance
mvn clean install -Dmaven.test.skip=true

pushd ../stock-positions-database
mvn clean install -Dmaven.test.skip=true
