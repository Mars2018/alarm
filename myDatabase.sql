CREATE TABLE alarm_info(
  id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  ip_source VARCHAR(30) NOT NULL UNIQUE ,
  alarm_name VARCHAR(20) NOT NULL ,
  alarm_type VARCHAR(30) NOT NULL ,
  alarm_value VARCHAR(20) NOT NULL ,
  alarm_level VARCHAR(20) NOT NULL ,
  start_datetime DATETIME DEFAULT now(),
  end_datetime DATETIME,
  alarm_clear INT(2) DEFAULT 0,
  clear_record VARCHAR(200),
  alarm_desc VARCHAR(200)
)ENGINE = INNODB DEFAULT CHARSET = utf8 ;

CREATE TABLE alarms(
  alarm_id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  service_id INT(20) NOT NULL ,
  alarm_time DATETIME DEFAULT now(),
  alarm_level VARCHAR(20) NOT NULL ,
  is_solved INT(2) DEFAULT 0,
  solve_record VARCHAR(200)
)ENGINE = INNODB DEFAULT CHARSET = utf8 ;

CREATE TABLE hosts (
  host_id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  host_name VARCHAR(30) NOT NULL UNIQUE ,
  host_ip VARCHAR(30) NOT NULL UNIQUE ,
  host_proxy_id INT(20),
  host_port VARCHAR(10),
  host_status INT(2) DEFAULT 1,
  enable INT(2) DEFAULT 1
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE items(
  item_id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  item_name VARCHAR(20) NOT NULL ,
  monitor_type VARCHAR(30) NOT NULL ,
  monitor_target VARCHAR(30) NOT NULL ,
  host_id INT(20) NOT NULL ,
  update_interval INT(10) DEFAULT 3,
  item_status INT(2) DEFAULT 1,
  history_keep INT(10) DEFAULT 30
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE triggers (
  trigger_id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  item_id INT(20) NOT NULL ,
  name VARCHAR(20) NOT NULL ,
  lastvalue INT(20),
  lastvalue_time DATETIME DEFAULT now(),
  statistical_method VARCHAR(20) NOT NULL ,
  judgment_condition VARCHAR(20) NOT NULL ,
  parameters VARCHAR(20) NOT NULL
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE services(
  service_id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  host_id INT(20) NOT NULL ,
  item_id INT(20) NOT NULL ,
  trigger_id INT(20) NOT NULL ,
  status INT(2) DEFAULT 1,
  service_start DATETIME DEFAULT now(),
  service_end DATETIME,
  dependencies VARCHAR(100),
  service_active VARCHAR(100)
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE monitor_target (
  id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL ,
  type_id INT(20) NOT NULL
)ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE monitor_type(
  id INT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(30) NOT NULL ,
  type_desc VARCHAR(200)
)ENGINE = INNODB DEFAULT CHARSET = utf8;