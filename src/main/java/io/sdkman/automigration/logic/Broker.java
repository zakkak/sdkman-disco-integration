package io.sdkman.automigration.logic;

import java.util.Map;

import static java.util.Map.entry;

public class Broker {

	// @formatter:off
    private static final Map<String, Map<String, String>> PLATFORMS = Map.ofEntries(
            entry("linux", Map.of("x64", "linux64",
                    "x86", "linux64",
                    "amd64", "linux64",
                    "aarch64", "linuxarm64",
                    "arm", "linuxarm64")),
            entry("macos", Map.of("x64", "darwin",
                    "x86", "darwin",
                    "amd64", "darwin",
                    "aarch64", "darwinarm64",
                    "arm", "darwinarm64")),
            entry("windows", Map.of("x64", "msys",
                    "x86", "msys",
                    "amd64", "msys")));
	// @formatter:on

	public static String platform(String os, String arch) {
		return PLATFORMS.get(os).get(arch);
	}

}
