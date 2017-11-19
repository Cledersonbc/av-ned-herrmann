#!/bin/bash

function create_jar() {
	# Temp dir to generate class files
	tmpdir=classes
	if [ -d "$tmpdir" ]
	then
		cp imgs/* $tmpdir
	else
		mkdir $tmpdir
		cp imgs/* $tmpdir
	fi

	# Compiling...
	javac -d $tmpdir project/model/*.java project/controller/*.java project/view/*.java
	cd $tmpdir
	echo "Main-Class: view.Home" > MANIFEST.MF
	# jar options:
	# c = create
	# f = file
	# v = verbose output
	# m = manifest
	jar cfvm av-ned-herrmann.jar MANIFEST.MF *.png *.jpg model/ controller/ view/
	cd ..
	cp $tmpdir/av-ned-herrmann.jar jar/av-ned-herrmann.jar

	# Deleting tmpdir
	rm -rf $tmpdir

	echo -e "\nCreated jar file. Done."
}

create_jar
