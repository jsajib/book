package com.jubydull.forjson;

import org.json.simple.JSONObject;

public interface JSONAble<J extends JSONObject> {
	public J toJSON();
}
