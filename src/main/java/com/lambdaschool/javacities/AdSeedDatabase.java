// 4

package com.lambdaschool.javacities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// makes logs
@Slf4j
// Tells Spring to look hear for the Bean
@Configuration
public class AdSeedDatabase
{
    @Bean
    public CommandLineRunner initDB(AcCityRepository cityrepos)
    {
        return args ->
        {
            log.info("Seeding " + cityrepos.save(new AbCity("Akron, Ohio", 135000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Albany, N.Y.", 182000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Albuquerque, N.M.", 167000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Allentown, Pa.", 175000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Atlanta, Ga.", 210000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Augusta, Ga.", 155000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Austin, Texas", 290000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Bakersfield, Calif.", 215000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Baltimore, Md.", 248000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Baton Rouge, La.", 168000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Birmingham, Ala.", 153000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Boise, Idaho", 260000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Boston, Mass.", 410000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Bridgeport, Conn.", 356000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Buffalo, N.Y.", 141000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Cape Coral, Fla.", 209000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Charleston, S.C.", 239000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Charlotte, N.C.", 204000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Chattanooga, Tenn.", 158000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Chicago, Ill.", 215000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Cincinnati, Ohio", 158000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Cleveland, Ohio", 128000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Colorado Springs, Colo.", 280000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Columbia, S.C.", 139000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Columbus, Ohio", 180000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Dallas, Texas", 195000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Dayton, Ohio", 120000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Deltona, Fla.", 191000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Denver, Colo.", 383000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Des Moines, Iowa", 173000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Detroit, Mich.", 157000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Durham, N.C.", 220000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("El Paso, Texas", 124000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("Fayetteville, Ark.", 180000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Fresno, Calif.", 250000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Grand Rapids, Mich.", 182000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Greensboro, N.C.", 140000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Greenville, S.C.", 170000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Harrisburg, Pa.", 163000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Hartford, Conn.", 209000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Honolulu, Hi.", 600000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Houston, Texas", 178000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Indianapolis, Ind.", 125000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Jacksonville, Fla.", 195000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Kansas City, Mo.", 143000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Knoxville, Tenn.", 162000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Lakeland, Fla.", 165000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("Lancaster, Pa.", 190000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Las Vegas, Nev.", 266000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Little Rock, Ark.", 145000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Los Angeles, Calif.", 634000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Louisville, Ky.", 168000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Madison, Wis.", 250000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Memphis, Tenn.", 142000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Miami, Fla.", 255000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Milwaukee, Wis.", 179000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Minneapolis-St. Paul, Minn.", 252000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Modesto, CA", 295000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Nashville, Tenn.", 247000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("New Haven, Conn.", 194000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("New Orleans, La.", 184000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("New York, N.Y.-N.J.", 410000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("North Port-Sarasota, Fla.", 234000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Ogden, Utah", 214000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Oklahoma City, Okla.", 148000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Omaha, Neb.", 180000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("Orlando, Fla.", 220000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Oxnard, Calif.", 589000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Palm Bay, Fla.", 185000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Philadelphia, Pa.", 205000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Phoenix, Ariz.", 252000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Pittsburgh, Pa.", 138000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Portland, Ore.", 370000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Providence, R.I.", 262000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("Raleigh, N.C.", 246000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("Richmond, Va.", 226000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Riverside-San Bernardino, Calif.", 339000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Rochester, N.Y.", 137000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Sacramento, Calif.", 375000, 8)));
            log.info("Seeding " + cityrepos.save(new AbCity("Salt Lake City, Utah", 255000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("San Antonio, Texas", 153000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("San Diego, Calif.", 545000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("San Francisco, Calif.", 860000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("San Jose, Calif.", 1100000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Scranton-Wilkes-Barre, Pa.", 100000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Seattle, Wash.", 430000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Spokane, Wash.", 228000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Springfield, Mass.", 200000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("St. Louis, Mo.", 157000, 4)));
            log.info("Seeding " + cityrepos.save(new AbCity("Stockton, Calif.", 335000, 10)));
            log.info("Seeding " + cityrepos.save(new AbCity("Syracuse, N.Y.", 112000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Tampa, Fla.", 189000, 5)));
            log.info("Seeding " + cityrepos.save(new AbCity("Toledo, Ohio", 109000, 1)));
            log.info("Seeding " + cityrepos.save(new AbCity("Tucson, Ariz.", 198000, 6)));
            log.info("Seeding " + cityrepos.save(new AbCity("Tulsa, Okla.", 146000, 3)));
            log.info("Seeding " + cityrepos.save(new AbCity("Virginia Beach, Va.", 217000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Washington, D.C.-No. Va.", 375000, 9)));
            log.info("Seeding " + cityrepos.save(new AbCity("Winston-Salem, N.C.", 144000, 2)));
            log.info("Seeding " + cityrepos.save(new AbCity("Worcester, Mass.", 241000, 7)));
            log.info("Seeding " + cityrepos.save(new AbCity("Youngstown, Ohio", 77000, 1)));
        };
    }

}
