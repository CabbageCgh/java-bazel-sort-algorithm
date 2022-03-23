load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_binary(
    name = "app",
    main_class = "com.example.sort.SortAlgorithm",
    runtime_deps = [
        ":sort-lib"
    ],
)

java_library(
    name = "sort-lib",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:com_google_guava_guava"
    ],
)
