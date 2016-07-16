# Java Mapping Projects

This project represents my first foray into the wonderful world of Java. Working with some base code from UCSD, I worked through every step of creating a Global Earthquake Mapper applet. I then built an Airport Connection Map for a final project. Overall, Object Oriented Programming in Java was a great course, and gave me skills to think modularly and build complex projects with nice GUIs up with some base Java libraries.

## Global Earthquake Mapper

This project is a Java Applet that allows users to interact with a global map with markers representing earthquakes that have occurred within the last 24 hours and cities that may lie within their threat circle.

### The Data

The data for the Global Earthquake Mapper is retrieved from a government-curated [GeoRSS feed](http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom), which returns an XML document with the requested information. The ParseFeed class in the parsing package is given the URI for the feed and is responsible for retrieving the data and turning it into a list of PointFeatures. Other data, like those responsible for defining country borders and city locations, are kept in the data folder and are parsed into mappable objects by a special JSON reader class.

### The Main Code

The EarthquakeCityMap class is responsible for the setup of the Java applet, and thus contains much of the key logic to deal with user interaction. Upon instantiation, the EarthquakeCityMap creates a new UnfoldingMap, creates lists of CityMarkers and EarthquakeMarkers--both defined within the package--as well as Markers representing countries from parsed data.

### The UI

The EarthquakeCityMap inherits from the the PApplet class, which allows for easy setup of a user interface, with simple event handling and layout design.
![Screenshot](documentation/earthquake_map_pic.png)
*Above: Global Earthquake Mapper Applet*
The earthquake marker shapes are decided by whether they occurred on land or in the sea, determined by checking whether they are within the bounds of any country. Their size is determined by their magnitude. Cities are represented by triangular markers. Both cities and earthquakes can be clicked, the former to discover any earthquakes that may threaten it and the latter to discover any cities within its threat circle. Finally, earthquakes from the past hour are marked with an 'X'.

## Airport Connection Map



## Key Classes from the Unfolding Maps Library

### UnfoldingMap


### Markers and Features
