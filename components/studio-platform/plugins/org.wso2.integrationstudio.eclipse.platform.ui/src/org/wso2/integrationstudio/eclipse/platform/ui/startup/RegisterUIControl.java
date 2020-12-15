/*
 * Copyright (c) 2010-2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.integrationstudio.eclipse.platform.ui.startup;

import java.util.HashMap;
import java.util.Map;

import org.wso2.integrationstudio.eclipse.platform.ui.interfaces.UIControl;

public class RegisterUIControl {

	private static Map<String, UIControl> uiControlList;

	public void registerUIControls(String controlID, UIControl control) {
		if (getUiControlList() == null) {
			setUiControlList(new HashMap<String, UIControl>());
		}
		if (!getUiControlList().containsValue(control)) {
			getUiControlList().put(controlID, control);
		}

	}

	public static void setUiControlList(Map<String, UIControl> uiControlList) {
		RegisterUIControl.uiControlList = uiControlList;
	}

	public static Map<String, UIControl> getUiControlList() {
		return uiControlList;
	}
}