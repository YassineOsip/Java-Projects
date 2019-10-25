package entities;

public class Auth {
	
		private Admin admin;
		private User user;
		
		
		public Auth (Admin admin, User user) {
			this.admin = admin;
			this.user = user;
		}


		public Admin getAdmin() {
			return admin;
		}


		public void setAdmin(Admin admin) {
			this.admin = admin;
		}


		public User getUser() {
			return user;
		}


		public void setUser(User user) {
			this.user = user;
		}
}
