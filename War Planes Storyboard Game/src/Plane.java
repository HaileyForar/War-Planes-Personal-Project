public class Plane
	{
		private String name;
		private String wingSpan;
		private String enginePower;
		private String war;
		private String timePeriod;
		private String sideOfTheWar;
		
	
		public Plane(String name, String wingSpan, String enginePower, String war, String timePeriod, String sideOfTheWar)
		{
			this.name = name;
			this.wingSpan = wingSpan;
			this.enginePower = enginePower;
			this.war = war;
			this.timePeriod = timePeriod;
			this.sideOfTheWar = sideOfTheWar;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getWingSpan()
			{
				return wingSpan;
			}

		public void setWingSpan(String wingSpan)
			{
				this.wingSpan = wingSpan;
			}

		public String getEnginePower()
			{
				return enginePower;
			}

		public void setEnginePower(String enginePower)
			{
				this.enginePower = enginePower;
			}

		public String getWar()
			{
				return war;
			}

		public void setWar(String war)
			{
				this.war = war;
			}

		public String getTimePeriod()
			{
				return timePeriod;
			}

		public void setTimePeriod(String timePeriod)
			{
				this.timePeriod = timePeriod;
			}

		public String getSideOfTheWar()
			{
				return sideOfTheWar;
			}

		public void setSideOfTheWar(String sideOfTheWar)
			{
				this.sideOfTheWar = sideOfTheWar;
			}
		
		@Override
		public String toString() {
			return ""; // TODO: add stats
		}
	
		
	}
