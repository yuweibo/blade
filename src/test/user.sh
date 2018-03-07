#!/bin/sh

#curl -X POST -d "username=22222&realName=fffff" localhost:9000/user

for i in `seq 1 10000`
do 
 echo `curl -X POST -d "username=22222&realName=fffff" localhost:9000/user`>> write.log 
done

curl -X GET localhost:9000/user
