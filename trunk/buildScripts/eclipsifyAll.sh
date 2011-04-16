#!/bin/bash

pushd ../stock-positions
mvn eclipse:eclipse

pushd ../stock-positions-acceptance
mvn eclipse:eclipse

pushd ../stock-positions-database
mvn eclipse:eclipse
