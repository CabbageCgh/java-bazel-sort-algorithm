load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

java_test(
    name = "SortAlgorithmTest",
    size = "small",
    srcs = glob(["*Test.java"]),
    deps = [
        "//java/com/example/sort:sort-lib",
        "@maven//:junit_junit",
    ]
)
