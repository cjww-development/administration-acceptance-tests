#!/bin/bash

DRIVER=gecko
BROWSER="firefox"

driver_path=/usr/local/bin/${DRIVER}driver
sbt -Dbrowser=${BROWSER} -Denvironment=local -DdmsEnabled=true -Dwebdriver.${DRIVER}.driver=${driver_path} 'test-only com.cjwwdev.cucumber.utils.Runner'
