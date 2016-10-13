Source Code - Pro Spring dm Server
------------------------------------------------------------------------

Contents 
---------------------
* ChapterXX directories - Source code for each chapter in Eclipse/STS-type directories (See pre-requisites for versions) 
* dmserver_builds - Pre-built applications for each chapter in case you dont or cant compile source code in Eclipse/STS.
* dmserver_bundle_deps - Bundle dependencies used by the dm Server (To be placed in /repository/bundle/usr/ or downloaded per instructions in the book) 
* dmserver_slices_subsystem - SpringSource Slices subsystem (To be unzipped in the dm Server's root directory, see book's Chapter 8 for further configuration instructions) 
* derbydb - Contains the Derby database used in the book's applications

Pre-requisites
------------------------------------------
Java SE 6 - All code was tested using Java 6
SpringSource dm Server - All code was tested using dm Server 2.0.M3 (and nightly release)
Eclipse or SpringSource Tools Suite(STS) - All code was developed using Eclipse 3.4 with Spring Tools 2.1GA and SpringSource Tool Suite 2.1GA(Eclipse3.4)
* Other pre-requisites are either included in this download or indicated for each chapter


Instructions - Compiling and running applications 
---------------------------------------------------------------
* Each Chapter's source code is contained in Eclipse/STS type directories contained in a top level directory. 
   Chapter01/ - Chapter 1 source code 
   Chapter02/ - Chapter 2 source code 
   etc.
 WARNING: You can't import these directory structures as if they were Eclipse/STS workspaces directly. Eclipse/STS places machine specific configuration files in its workspaces (e.g.classpath, versions,etc), therefore you will need to create your own workspaces -- per instructions in the book -- and then import the source code from the provided directory structures. 

* If you want to run each Chapter's applications without using Eclipse/STS to compile the source code, the 'dmserver_builds' directory contains pre-built applications ready to be installed on the dm Server.
