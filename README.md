lattice-ratpack
===============

This is a sample project to demonstrate running a ratpack application on lattice-cf.

Running lattice-ratpack
-----------------------

    LATTICE_CLI_TIMEOUT=300 ltc create lattice-ratpack stevegood/lattice-ratpack --memory-mb 0

For some reason, initial startup seems to take a while, hence the long timeout for lattice.  Also, removing the memory limit will stop the application from crashing. A better practice would be to determine the actual memory required for the app and use that instead of 0.
