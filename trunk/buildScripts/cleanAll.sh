#!/bin/bash

pushd /home/alexco/workspace/stockPositions/stock-positions
mvn clean eclipse:clean

pushd /home/alexco/workspace/stockPositions/stock-positions-acceptance
mvn clean eclipse:clean

pushd /home/alexco/workspace/stockPositions/stock-positions-database
mvn clean eclipse:clean
