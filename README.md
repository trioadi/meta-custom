Yocto Project: Linux Custom Image for Raspberry pi board
==============================================================================

This is the Linux custom image for raspberry pi3 board and yocto project kirkstone

in this image include basic driver such as bluetooth, wifi, spi, i2c

support LCD Display 3.5” RPi Display(MPI3501) without any configuration

Dependencies
============

Add this layer to bblayers.conf 

set machine in local.conf if you using another raspberry pi model

run bitbake meta-custom

this image recently not supported for touchscreen features
