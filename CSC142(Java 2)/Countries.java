public class Countries
{
   public static void main(String[] args)
   {
      String[] countryNames = new String[12];
      int[] countryPopulations = new int[12];
      countryNames[0] = "United States of America";
      countryNames[1] = "Canada";
      countryNames[2] = "Mexico";
      countryNames[3] = "China";
      countryNames[4] = "South Africa";
      countryNames[5] = "Great Britain";
      countryNames[6] = "Finland";
      countryNames[7] = "Sweden";
      countryNames[8] = "Greenland";
      countryNames[9] = "Germany";
      countryNames[10] = "France";
      countryNames[11] = "Greece";
      
      countryPopulations[0] = 2600000;
      countryPopulations[1] = 3500000;
      countryPopulations[2] = 6600000;
      countryPopulations[3] = 7630000;
      countryPopulations[4] = 8600000;
      countryPopulations[5] = 5400000;
      countryPopulations[6] = 7800000;
      countryPopulations[7] = 9700000;
      countryPopulations[8] = 4800000;
      countryPopulations[9] = 8300000;
      countryPopulations[10] = 2900000;
      countryPopulations[11] = 9300000;
      
      for( int i = 0; i < countryNames.length; i++)
      {
         System.out.println(countryNames[i] + ", Population: " + countryPopulations[i]);
      
      }
      
      
   }
   
}   