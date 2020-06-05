# liferay-upgrade-process

Explore and demonstrate Liferay's upgrade process feature.

## Tools and Versions

* `settings.gradle`:

	buildscript {
		dependencies {
			classpath group: "com.liferay", name: "com.liferay.gradle.plugins.workspace", version: "2.2.6"
			classpath group: "net.saliman", name: "gradle-properties-plugin", version: "1.4.6"
		}
	
		repositories {
			maven {
				url "https://repository-cdn.liferay.com/nexus/content/groups/public"
			}
		}
	}

* `gradle-local.properties`:

	liferay.workspace.bundle.url = https://releases-cdn.liferay.com/portal/7.2.1-ga2/liferay-ce-portal-tomcat-7.2.1-ga2-20191111141448326.tar.gz
	liferay.workspace.target.platform.version=7.2.1
	liferay.workspace.bundle.token.download=true

* Liferay Developer Studio: Version: 3.8.0.202002250521-ga1
