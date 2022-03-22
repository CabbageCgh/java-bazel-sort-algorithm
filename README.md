# java_bazel_exchange_sort

#build
bazel build //src/main/java/com/example/sort:app_deploy.jar

#test
bazel test //src/main/java/com/example/sort/test/...

#run
java -jar bazel-bin/src/main/java/com/example/sort/app_deploy.jar


