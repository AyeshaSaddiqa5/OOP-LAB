
    public class Music {
        String title;
        String duration;
        String genre;
        String singer;
        Date releaseDate;

        Music(String title,String duration,String genre, String singer, Date releaseDate){
            this.title=title;
            this.duration=duration;
            this.genre=genre;
            this.singer=singer;
            this.releaseDate=releaseDate;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getSinger() {
            return singer;
        }

        public void setSinger(String singer) {
            this.singer = singer;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }
        public String toString(){
            return String.format("%s %s %s %s %s",title,duration,genre,singer,releaseDate);
        }
        public boolean equals(Object o) {
            Music M = (Music) o;
            return M.title == this.title ? true : false;

        }
    }

