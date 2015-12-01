lattice-ratpack
===============

This is a sample project to demonstrate running a ratpack application on lattice-cf.

Running lattice-ratpack
-----------------------

    LATTICE_CLI_TIMEOUT=300 ltc create lattice-ratpack stevegood/lattice-ratpack --memory-mb 0

For some reason, initial startup seems to take a while, hence the long timeout for lattice :trollface:.  Also, removing the memory limit will stop the application from crashing. A better practice would be to determine the actual memory required for the app and use that instead of 0.

If, for whatever reason, the app seems to never start, try scaling it up to 2 instances, that seems to get it working at times. :see_no_evil::hear_no_evil::speak_no_evil:

    ltc scale lattice-ratpack 2
