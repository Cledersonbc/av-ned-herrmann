package controller;

/**
 * @author Clederson Cruz
 * Relationship: 1 to 1
 * This controller controls one profile.
 */

import model.Profile;

public class CtrlHome {
	private Profile profile;
	
	public CtrlHome() {
		profile = null;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
