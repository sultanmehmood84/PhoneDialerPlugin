<<<<<<< HEAD
package com.teamnemitoff.phonedialer;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class PhoneDialer extends CordovaPlugin {
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
	    try {
	    	String phoneNumber = args.getString(0);
		String encodedPhonenumber = "+19197257941,43188,#,29493,#";
	    	Uri uri = new Uri.Builder().scheme("tel").encodedPath(phonenumber).build();
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(uri);
            this.cordova.getActivity().startActivity(callIntent);
            callbackContext.success();
            return true;
        } catch (Exception e) {
        	String msg = "Exception Dialing Phone Number: " + e.getMessage();
        	System.err.println(msg);
	        callbackContext.error(msg);
	        return false;
        }
	}
=======
package com.teamnemitoff.phonedialer;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class PhoneDialer extends CordovaPlugin {
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
	    try {
	    	String phoneNumber = args.getString(0);
		String encodedPhonenumber = "+19197257941,43188,#,29493,#";
	    	Uri uri = Uri.parse("tel:"+encodedPhonenumber);
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(uri);
            this.cordova.getActivity().startActivity(callIntent);
            callbackContext.success();
            return true;
        } catch (Exception e) {
        	String msg = "Exception Dialing Phone Number: " + e.getMessage();
        	System.err.println(msg);
	        callbackContext.error(msg);
	        return false;
        }
	}
>>>>>>> debbd7ce4671a18362d435ad06426bef7d099b1c
}