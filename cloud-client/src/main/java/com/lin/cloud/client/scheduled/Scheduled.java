package com.lin.cloud.client.scheduled;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
/**
 * Description:
 *
 * @author <a href="mailto:">linl</a>
 * @version $Id: Scheduled.java, 2019/10/26 12:47 $
 */
@Service
@EnableScheduling
public class Scheduled {

  @org.springframework.scheduling.annotation.Scheduled(fixedRate = 1000 * 10 * 60)
  public void grab() {
	System.out.println("1");
  }

}
