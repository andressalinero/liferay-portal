/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.util;

import com.liferay.petra.string.StringPool;

import java.text.DateFormat;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
public class ReleaseInfo {

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_0_0_BUILD_NUMBER = 5000;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_0_1_BUILD_NUMBER = 5001;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_1_0_BUILD_NUMBER = 5100;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_1_1_BUILD_NUMBER = 5101;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_1_2_BUILD_NUMBER = 5102;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_1_5_BUILD_NUMBER = 5105;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_1_6_BUILD_NUMBER = 5106;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_1_7_BUILD_NUMBER = 5107;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_0_BUILD_NUMBER = 5200;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_1_BUILD_NUMBER = 5201;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_2_BUILD_NUMBER = 5202;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_3_BUILD_NUMBER = 5203;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_5_BUILD_NUMBER = 5205;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_7_BUILD_NUMBER = 5207;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_8_BUILD_NUMBER = 5208;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_5_2_9_BUILD_NUMBER = 5209;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_0_BUILD_NUMBER = 6000;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_1_BUILD_NUMBER = 6001;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_2_BUILD_NUMBER = 6002;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_3_BUILD_NUMBER = 6003;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_4_BUILD_NUMBER = 6004;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_5_BUILD_NUMBER = 6005;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_6_BUILD_NUMBER = 6006;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_10_BUILD_NUMBER = 6010;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_11_BUILD_NUMBER = 6011;

	/**
	 * @deprecated As of 7.0.0, with no direct replacement
	 */
	@Deprecated
	public static final int RELEASE_6_0_12_BUILD_NUMBER = 6012;

	public static final int RELEASE_6_1_0_BUILD_NUMBER = 6100;

	public static final int RELEASE_6_1_1_BUILD_NUMBER = 6101;

	public static final int RELEASE_6_1_10_BUILD_NUMBER = 6110;

	public static final int RELEASE_6_1_20_BUILD_NUMBER = 6120;

	public static final int RELEASE_6_2_0_BUILD_NUMBER = 6200;

	public static final int RELEASE_6_2_1_BUILD_NUMBER = 6201;

	public static final int RELEASE_6_2_2_BUILD_NUMBER = 6202;

	public static final int RELEASE_6_2_3_BUILD_NUMBER = 6203;

	public static final int RELEASE_6_2_10_BUILD_NUMBER = 6210;

	public static final int RELEASE_7_0_0_BUILD_NUMBER = 7000;

	public static final int RELEASE_7_0_1_BUILD_NUMBER = 7001;

	public static final int RELEASE_7_0_2_BUILD_NUMBER = 7002;

	public static final int RELEASE_7_0_3_BUILD_NUMBER = 7003;

	public static final int RELEASE_7_0_4_BUILD_NUMBER = 7004;

	public static final int RELEASE_7_0_5_BUILD_NUMBER = 7005;

	public static final int RELEASE_7_0_6_BUILD_NUMBER = 7006;

	public static final int RELEASE_7_0_10_BUILD_NUMBER = 7010;

	public static final int RELEASE_7_1_0_BUILD_NUMBER = 7100;

	public static final int RELEASE_7_1_10_BUILD_NUMBER = 7110;

	public static final Date getBuildDate() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

		return GetterUtil.getDate(_DATE, df);
	}

	public static final int getBuildNumber() {
		return _BUILD_NUMBER;
	}

	public static final String getCodeName() {
		return _CODE_NAME;
	}

	public static final String getName() {
		return _NAME;
	}

	public static final int getParentBuildNumber() {
		return _PARENT_BUILD_NUMBER;
	}

	public static final String getReleaseInfo() {
		if (_releaseInfo == null) {
			_releaseInfo = StringBundler.concat(
				_RELEASE_INFO_PREFIX, _NAME, " ", _VERSION_DISPLAY_NAME, " (",
				_CODE_NAME, " / Build ", _BUILD, " / ", _DATE, ")",
				_RELEASE_INFO_SUFFIX);
		}

		return _releaseInfo;
	}

	public static final String getServerInfo() {
		if (_serverInfo == null) {
			_serverInfo = _NAME + " / " + _VERSION;
		}

		return _serverInfo;
	}

	public static String getVendor() {
		return _VENDOR;
	}

	public static final String getVersion() {
		return _VERSION;
	}

	private static final String _BUILD = "7100";

	private static final int _BUILD_NUMBER = GetterUtil.getInteger(_BUILD);

	private static final String _CODE_NAME = "Judson";

	private static final String _DATE = "June 6, 2018";

	private static final String _NAME = "Liferay Community Edition Portal";

	private static final int _PARENT_BUILD_NUMBER = _BUILD_NUMBER;

	private static final String _RELEASE_INFO_PREFIX = System.getProperty(
		"liferay.release.info.prefix", StringPool.BLANK);

	private static final String _RELEASE_INFO_SUFFIX = System.getProperty(
		"liferay.release.info.suffix", StringPool.BLANK);

	private static final String _VENDOR = "Liferay, Inc.";

	private static final String _VERSION = "7.1.0";

	private static final String _VERSION_DISPLAY_NAME = "7.1.0 CE Beta 3";

	private static String _releaseInfo;
	private static String _serverInfo;

}