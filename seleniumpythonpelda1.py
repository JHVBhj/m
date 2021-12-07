from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from time import sleep

driver = webdriver.Chrome("T:\SzékelyMária\chromedriver")
driver.get("http://www.python.org")
assert "Python" in driver.title

driver.close()
//letolteni pip install selenium
chromedriver
