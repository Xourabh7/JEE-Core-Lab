package lab4;

import java.util.Objects;

abstract class Item {
	 
	 long identificationnumber;
	 String title;
	 int noofcopies;
	
	 public Item(){
		 identificationnumber =0;
		 title = " ";
		 noofcopies = 0;
		 }

	public Item(long identificationnumber, String title, int noofcopies) {
		super();
		this.identificationnumber = identificationnumber;
		this.title = title;
		this.noofcopies = noofcopies;
	}

	public long getIdentificationnumber() {
		return identificationnumber;
	}

	public void setIdentificationnumber(long identificationnumber) {
		this.identificationnumber = identificationnumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoofcopies() {
		return noofcopies;
	}

	public void setNoofcopies(int noofcopies) {
		this.noofcopies = noofcopies;
	}
	public void checkIn(){
		noofcopies = noofcopies + 1;
		}
		public void checkOut(){
			noofcopies = noofcopies - 1;
		}

	@Override
	public String toString() {
		return "Item [identificationnumber=" + identificationnumber + ", title=" + title + ", noofcopies=" + noofcopies
				+ "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return identificationnumber == other.identificationnumber && noofcopies == other.noofcopies
				&& Objects.equals(title, other.title);
	}

	
	
	
	
}
