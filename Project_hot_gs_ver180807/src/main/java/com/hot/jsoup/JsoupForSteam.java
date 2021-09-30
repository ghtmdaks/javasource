package com.hot.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupForSteam {
	
	public SteamReviewJsoupDTO getReviews (String steamAppId) {
		SteamReviewJsoupDTO srj = new SteamReviewJsoupDTO();
		try {
			Document document = Jsoup.connect("https://store.steampowered.com/app/" + steamAppId + "/").get();
			Elements elements = document.select("span.game_review_summary");

			String recentReviews = null;
			String allReviews = null;
			String recentTooltip = null;
			String allTooltip = null;
			
			switch (elements.size()) {
			case 2:
				allReviews = elements.get(0).toString();
				allTooltip = elements.get(1).toString();

				allReviews = allReviews.substring(allReviews.indexOf('>') + 1, allReviews.lastIndexOf('<'));
				allTooltip = allTooltip.substring(0, allTooltip.lastIndexOf('"'));
				allTooltip = allTooltip.substring(allTooltip.lastIndexOf('"') + 1);
				break;
			case 4:
				recentReviews = elements.get(0).toString();
				allReviews = elements.get(1).toString();
				recentTooltip = elements.get(2).toString();
				allTooltip = elements.get(3).toString();

				recentReviews = recentReviews.substring(recentReviews.indexOf('>') + 1, recentReviews.lastIndexOf('<'));
				allReviews = allReviews.substring(allReviews.indexOf('>') + 1, allReviews.lastIndexOf('<'));
				recentTooltip = recentTooltip.substring(0, recentTooltip.lastIndexOf('"'));
				recentTooltip = recentTooltip.substring(recentTooltip.lastIndexOf('"') + 1);
				allTooltip = allTooltip.substring(0, allTooltip.lastIndexOf('"'));
				allTooltip = allTooltip.substring(allTooltip.lastIndexOf('"') + 1);
				break;
			}
			
			srj.setRecentReviews(recentReviews);
			srj.setAllReviews(allReviews);
			srj.setRecentTooltip(recentTooltip);
			srj.setAllTooltip(allTooltip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return srj;
	}

}
