#!/bin/bash
mysql --host=127.0.0.1 --port=4000 -u root --password= -e "drop database if exists simonsthings; create database simonsthings;"
