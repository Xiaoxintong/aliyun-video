package com.aliyun.player.alivcplayerexpand.util;

import com.cicada.player.utils.Logger;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {
    private static final int INT_EMPTY_VALUE = 0;
    private static final String STR_EMPTY_VALUE = "";

    public static int getInt(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return 0;
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getInt(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json int value for " + oneName);
            }

            return 0;
        }
    }

    public static String getString(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return "";
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getString(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json string value for " + oneName);
            }

            return "";
        }
    }

    public static JSONObject getJSONObject(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return null;
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getJSONObject(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json object value for " + oneName);
            }

            return null;
        }
    }

    public static double getDouble(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return (double)0.0F;
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getDouble(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json double value for " + oneName);
            }

            return (double)0.0F;
        }
    }

    public static long getLong(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return 0L;
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getLong(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json long value for " + oneName);
            }

            return 0L;
        }
    }

    public static JSONArray getArray(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return null;
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getJSONArray(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json long value for " + oneName);
            }

            return null;
        }
    }

    public static JSONObject getJSONObjectAt(JSONArray jsonArray, int index) {
        if (jsonArray == null) {
            return null;
        } else {
            try {
                return jsonArray.getJSONObject(index);
            } catch (JSONException var3) {
                return null;
            }
        }
    }

    public static boolean getBoolean(JSONObject jsonObject, String... name) {
        if (jsonObject == null) {
            return false;
        } else {
            for(String oneName : name) {
                try {
                    return jsonObject.getBoolean(oneName);
                } catch (JSONException var7) {
                }
            }

            for(String oneName : name) {
                Logger.w("JsonUtil", "No json boolean value for " + oneName);
            }

            return false;
        }
    }
}
