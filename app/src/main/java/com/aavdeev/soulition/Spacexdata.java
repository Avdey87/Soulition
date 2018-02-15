package com.aavdeev.soulition;

import java.util.List;

public class Spacexdata {

    /**
     * flight_number : 35
     * launch_year : 2017
     * launch_date_unix : 1484416440
     * launch_date_utc : 2017-01-14T17:54:00Z
     * launch_date_local : 2017-01-14T10:54:00-07:00
     * rocket : {"rocket_id":"falcon9","rocket_name":"Falcon 9","rocket_type":"FT","first_stage":{"cores":[{"core_serial":"B1029","reused":false,"land_success":true,"landing_type":"ASDS","landing_vehicle":"JRTI"}]},"second_stage":{"payloads":[{"payload_id":"Iridium NEXT 1","reused":false,"customers":["Iridium Communications"],"payload_type":"Satellite","payload_mass_kg":9600,"payload_mass_lbs":21200,"orbit":"LEO"}]}}
     * reuse : {"core":false,"side_core1":false,"side_core2":false,"fairings":false,"capsule":false}
     * telemetry : {"flight_club":"https://www.flightclub.io/results/?code=IRD1"}
     * launch_site : {"site_id":"vafb_slc_4e","site_name":"VAFB SLC 4E","site_name_long":"Vandenberg Air Force Base Space Launch Complex 4E"}
     * launch_success : true
     * links : {"mission_patch":"http://i.imgur.com/f2OA2As.png","reddit_campaign":"https://www.reddit.com/r/spacex/comments/5dii6z","reddit_launch":"https://www.reddit.com/r/spacex/comments/5nsaqm","reddit_recovery":"https://www.reddit.com/r/spacex/comments/5oe9kk","reddit_media":"https://www.reddit.com/r/spacex/comments/5nsico","presskit":"https://drive.google.com/open?id=0BwA3a65ef1OvZC1aU3FuMlQzalE","article_link":"https://en.wikipedia.org/wiki/Iridium_satellite_constellation#Next-generation_constellation","video_link":"https://www.youtube.com/watch?v=7WimRhydggo"}
     *   : Return-to-flight mission after the loss of Amos-6 in September 2016. Iridium NEXT will replace the original Iridium constellation, launched in the late 1990s. Each Falcon mission will carry 10 satellites, with a goal to complete deployment of the 66 plus 9 spare satellite constellation by mid 2018. The first two Iridium qualification units were supposed to ride a Dnepr rocket in April 2016 but were delayed, so Iridium decided to qualify the first batch of 10 satellites instead.
     */

    private int flight_number;
    private String launch_year;
    private int launch_date_unix;
    private String launch_date_utc;
    private String launch_date_local;
    private RocketBean rocket;
    private ReuseBean reuse;
    private TelemetryBean telemetry;
    private LaunchSiteBean launch_site;
    private boolean launch_success;
    private LinksBean links;
    private String details;

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public void setLaunch_year(String launch_year) {
        this.launch_year = launch_year;
    }

    public int getLaunch_date_unix() {
        return launch_date_unix;
    }

    public void setLaunch_date_unix(int launch_date_unix) {
        this.launch_date_unix = launch_date_unix;
    }

    public String getLaunch_date_utc() {
        return launch_date_utc;
    }

    public void setLaunch_date_utc(String launch_date_utc) {
        this.launch_date_utc = launch_date_utc;
    }

    public String getLaunch_date_local() {
        return launch_date_local;
    }

    public void setLaunch_date_local(String launch_date_local) {
        this.launch_date_local = launch_date_local;
    }

    public RocketBean getRocket() {
        return rocket;
    }

    public void setRocket(RocketBean rocket) {
        this.rocket = rocket;
    }

    public ReuseBean getReuse() {
        return reuse;
    }

    public void setReuse(ReuseBean reuse) {
        this.reuse = reuse;
    }

    public TelemetryBean getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(TelemetryBean telemetry) {
        this.telemetry = telemetry;
    }

    public LaunchSiteBean getLaunch_site() {
        return launch_site;
    }

    public void setLaunch_site(LaunchSiteBean launch_site) {
        this.launch_site = launch_site;
    }

    public boolean isLaunch_success() {
        return launch_success;
    }

    public void setLaunch_success(boolean launch_success) {
        this.launch_success = launch_success;
    }

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public static class RocketBean {
        /**
         * rocket_id : falcon9
         * rocket_name : Falcon 9
         * rocket_type : FT
         * first_stage : {"cores":[{"core_serial":"B1029","reused":false,"land_success":true,"landing_type":"ASDS","landing_vehicle":"JRTI"}]}
         * second_stage : {"payloads":[{"payload_id":"Iridium NEXT 1","reused":false,"customers":["Iridium Communications"],"payload_type":"Satellite","payload_mass_kg":9600,"payload_mass_lbs":21200,"orbit":"LEO"}]}
         */

        private String rocket_id;
        private String rocket_name;
        private String rocket_type;
        private FirstStageBean first_stage;
        private SecondStageBean second_stage;

        public String getRocket_id() {
            return rocket_id;
        }

        public void setRocket_id(String rocket_id) {
            this.rocket_id = rocket_id;
        }

        public String getRocket_name() {
            return rocket_name;
        }

        public void setRocket_name(String rocket_name) {
            this.rocket_name = rocket_name;
        }

        public String getRocket_type() {
            return rocket_type;
        }

        public void setRocket_type(String rocket_type) {
            this.rocket_type = rocket_type;
        }

        public FirstStageBean getFirst_stage() {
            return first_stage;
        }

        public void setFirst_stage(FirstStageBean first_stage) {
            this.first_stage = first_stage;
        }

        public SecondStageBean getSecond_stage() {
            return second_stage;
        }

        public void setSecond_stage(SecondStageBean second_stage) {
            this.second_stage = second_stage;
        }

        public static class FirstStageBean {
            private List<CoresBean> cores;

            public List<CoresBean> getCores() {
                return cores;
            }

            public void setCores(List<CoresBean> cores) {
                this.cores = cores;
            }

            public static class CoresBean {
                /**
                 * core_serial : B1029
                 * reused : false
                 * land_success : true
                 * landing_type : ASDS
                 * landing_vehicle : JRTI
                 */

                private String core_serial;
                private boolean reused;
                private boolean land_success;
                private String landing_type;
                private String landing_vehicle;

                public String getCore_serial() {
                    return core_serial;
                }

                public void setCore_serial(String core_serial) {
                    this.core_serial = core_serial;
                }

                public boolean isReused() {
                    return reused;
                }

                public void setReused(boolean reused) {
                    this.reused = reused;
                }

                public boolean isLand_success() {
                    return land_success;
                }

                public void setLand_success(boolean land_success) {
                    this.land_success = land_success;
                }

                public String getLanding_type() {
                    return landing_type;
                }

                public void setLanding_type(String landing_type) {
                    this.landing_type = landing_type;
                }

                public String getLanding_vehicle() {
                    return landing_vehicle;
                }

                public void setLanding_vehicle(String landing_vehicle) {
                    this.landing_vehicle = landing_vehicle;
                }
            }
        }

        public static class SecondStageBean {
            private List<PayloadsBean> payloads;

            public List<PayloadsBean> getPayloads() {
                return payloads;
            }

            public void setPayloads(List<PayloadsBean> payloads) {
                this.payloads = payloads;
            }

            public static class PayloadsBean {
                /**
                 * payload_id : Iridium NEXT 1
                 * reused : false
                 * customers : ["Iridium Communications"]
                 * payload_type : Satellite
                 * payload_mass_kg : 9600
                 * payload_mass_lbs : 21200
                 * orbit : LEO
                 */

                private String payload_id;
                private boolean reused;
                private String payload_type;
                private int payload_mass_kg;
                private int payload_mass_lbs;
                private String orbit;
                private List<String> customers;

                public String getPayload_id() {
                    return payload_id;
                }

                public void setPayload_id(String payload_id) {
                    this.payload_id = payload_id;
                }

                public boolean isReused() {
                    return reused;
                }

                public void setReused(boolean reused) {
                    this.reused = reused;
                }

                public String getPayload_type() {
                    return payload_type;
                }

                public void setPayload_type(String payload_type) {
                    this.payload_type = payload_type;
                }

                public int getPayload_mass_kg() {
                    return payload_mass_kg;
                }

                public void setPayload_mass_kg(int payload_mass_kg) {
                    this.payload_mass_kg = payload_mass_kg;
                }

                public int getPayload_mass_lbs() {
                    return payload_mass_lbs;
                }

                public void setPayload_mass_lbs(int payload_mass_lbs) {
                    this.payload_mass_lbs = payload_mass_lbs;
                }

                public String getOrbit() {
                    return orbit;
                }

                public void setOrbit(String orbit) {
                    this.orbit = orbit;
                }

                public List<String> getCustomers() {
                    return customers;
                }

                public void setCustomers(List<String> customers) {
                    this.customers = customers;
                }
            }
        }
    }

    public static class ReuseBean {
        /**
         * core : false
         * side_core1 : false
         * side_core2 : false
         * fairings : false
         * capsule : false
         */

        private boolean core;
        private boolean side_core1;
        private boolean side_core2;
        private boolean fairings;
        private boolean capsule;

        public boolean isCore() {
            return core;
        }

        public void setCore(boolean core) {
            this.core = core;
        }

        public boolean isSide_core1() {
            return side_core1;
        }

        public void setSide_core1(boolean side_core1) {
            this.side_core1 = side_core1;
        }

        public boolean isSide_core2() {
            return side_core2;
        }

        public void setSide_core2(boolean side_core2) {
            this.side_core2 = side_core2;
        }

        public boolean isFairings() {
            return fairings;
        }

        public void setFairings(boolean fairings) {
            this.fairings = fairings;
        }

        public boolean isCapsule() {
            return capsule;
        }

        public void setCapsule(boolean capsule) {
            this.capsule = capsule;
        }
    }

    public static class TelemetryBean {
        /**
         * flight_club : https://www.flightclub.io/results/?code=IRD1
         */

        private String flight_club;

        public String getFlight_club() {
            return flight_club;
        }

        public void setFlight_club(String flight_club) {
            this.flight_club = flight_club;
        }
    }

    public static class LaunchSiteBean {
        /**
         * site_id : vafb_slc_4e
         * site_name : VAFB SLC 4E
         * site_name_long : Vandenberg Air Force Base Space Launch Complex 4E
         */

        private String site_id;
        private String site_name;
        private String site_name_long;

        public String getSite_id() {
            return site_id;
        }

        public void setSite_id(String site_id) {
            this.site_id = site_id;
        }

        public String getSite_name() {
            return site_name;
        }

        public void setSite_name(String site_name) {
            this.site_name = site_name;
        }

        public String getSite_name_long() {
            return site_name_long;
        }

        public void setSite_name_long(String site_name_long) {
            this.site_name_long = site_name_long;
        }
    }

    public static class LinksBean {
        /**
         * mission_patch : http://i.imgur.com/f2OA2As.png
         * reddit_campaign : https://www.reddit.com/r/spacex/comments/5dii6z
         * reddit_launch : https://www.reddit.com/r/spacex/comments/5nsaqm
         * reddit_recovery : https://www.reddit.com/r/spacex/comments/5oe9kk
         * reddit_media : https://www.reddit.com/r/spacex/comments/5nsico
         * presskit : https://drive.google.com/open?id=0BwA3a65ef1OvZC1aU3FuMlQzalE
         * article_link : https://en.wikipedia.org/wiki/Iridium_satellite_constellation#Next-generation_constellation
         * video_link : https://www.youtube.com/watch?v=7WimRhydggo
         */

        private String mission_patch;
        private String reddit_campaign;
        private String reddit_launch;
        private String reddit_recovery;
        private String reddit_media;
        private String presskit;
        private String article_link;
        private String video_link;

        public String getMission_patch() {
            return mission_patch;
        }

        public void setMission_patch(String mission_patch) {
            this.mission_patch = mission_patch;
        }

        public String getReddit_campaign() {
            return reddit_campaign;
        }

        public void setReddit_campaign(String reddit_campaign) {
            this.reddit_campaign = reddit_campaign;
        }

        public String getReddit_launch() {
            return reddit_launch;
        }

        public void setReddit_launch(String reddit_launch) {
            this.reddit_launch = reddit_launch;
        }

        public String getReddit_recovery() {
            return reddit_recovery;
        }

        public void setReddit_recovery(String reddit_recovery) {
            this.reddit_recovery = reddit_recovery;
        }

        public String getReddit_media() {
            return reddit_media;
        }

        public void setReddit_media(String reddit_media) {
            this.reddit_media = reddit_media;
        }

        public String getPresskit() {
            return presskit;
        }

        public void setPresskit(String presskit) {
            this.presskit = presskit;
        }

        public String getArticle_link() {
            return article_link;
        }

        public void setArticle_link(String article_link) {
            this.article_link = article_link;
        }

        public String getVideo_link() {
            return video_link;
        }

        public void setVideo_link(String video_link) {
            this.video_link = video_link;
        }
    }
}
