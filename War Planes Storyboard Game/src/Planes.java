public class Planes
	{
		private String name;
		private String wingSpan;
		private String enginePower;
		private String war;
		private String timePeriod;
		private String sideOfTheWar;
		
		public Planes(String n, String w, String e, String wa, String t, String s)
		{
			name = n;
			wingSpan = w;
			enginePower = e;
			war = wa;
			timePeriod = t;
			sideOfTheWar = s;
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
		
		

	}
