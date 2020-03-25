package com.chberndt.liferay.upgrade.process.service.internal;

import com.chberndt.liferay.upgrade.process.service.internal.upgrade.v1_1_0.UpgradeFoo;

import com.liferay.portal.kernel.upgrade.DummyUpgradeStep;
import com.liferay.portal.upgrade.registry.UpgradeStepRegistrator;

import org.osgi.service.component.annotations.Component;

/**
 * @author Christian Berndt
 */
@Component(immediate = true, service = UpgradeStepRegistrator.class)
public class UpgradeProcessServiceUpgrade implements UpgradeStepRegistrator {

	@Override
	public void register(Registry registry) {
		registry.register("0.0.0", "2.0.0", new DummyUpgradeStep());

		registry.register("1.0.0", "1.1.0", new UpgradeFoo());
	}

}