package com.redhat.demos.imagegapanalysis;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MovieEpisodeRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Name 952")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("Type")
   private java.lang.String type;
   @org.kie.api.definition.type.Label("Air Date")
   private java.util.Date airDate;
   @org.kie.api.definition.type.Label("Release Year")
   private java.lang.String releaseYear;
   @org.kie.api.definition.type.Label("Synopsis")
   private java.lang.String synopsis;

   @org.kie.api.definition.type.Label("Poster URL")
   private java.lang.String posterURL;

   public MovieEpisodeRequest()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.util.Date getAirDate()
   {
      return this.airDate;
   }

   public void setAirDate(java.util.Date airDate)
   {
      this.airDate = airDate;
   }

   public java.lang.String getReleaseYear()
   {
      return this.releaseYear;
   }

   public void setReleaseYear(java.lang.String releaseYear)
   {
      this.releaseYear = releaseYear;
   }

   public java.lang.String getSynopsis()
   {
      return this.synopsis;
   }

   public void setSynopsis(java.lang.String synopsis)
   {
      this.synopsis = synopsis;
   }

   public java.lang.String getPosterURL()
   {
      return this.posterURL;
   }

   public void setPosterURL(java.lang.String posterURL)
   {
      this.posterURL = posterURL;
   }

   public MovieEpisodeRequest(java.lang.String name, java.lang.String type,
         java.util.Date airDate, java.lang.String releaseYear,
         java.lang.String synopsis, java.lang.String posterURL)
   {
      this.name = name;
      this.type = type;
      this.airDate = airDate;
      this.releaseYear = releaseYear;
      this.synopsis = synopsis;
      this.posterURL = posterURL;
   }

}
