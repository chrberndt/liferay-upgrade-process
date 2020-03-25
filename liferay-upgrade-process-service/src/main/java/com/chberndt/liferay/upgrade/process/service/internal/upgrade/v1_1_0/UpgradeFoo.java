package com.chberndt.liferay.upgrade.process.service.internal.upgrade.v1_1_0;

import com.chberndt.liferay.upgrade.process.model.Foo;

import com.liferay.portal.kernel.upgrade.UpgradeProcess;

/**
 * @author Christian Berndt
 */
public class UpgradeFoo extends UpgradeProcess {

	@Override
	protected void doUpgrade() throws Exception {
		alter(Foo.class, new AlterTableAddColumn("field6 VARCHAR(255)"));
	}

}