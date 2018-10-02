package com.poc;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="publicinfo")
@RefreshScope
public class FullReloadableProperties {
	private Properties subsystemtocapierrormap;

	public Properties getSubsystemtocapierrormap() {
		return subsystemtocapierrormap;
	}

	public void setSubsystemtocapierrormap(Properties subsystemtocapierrormap) {
		this.subsystemtocapierrormap = subsystemtocapierrormap;
	}
}