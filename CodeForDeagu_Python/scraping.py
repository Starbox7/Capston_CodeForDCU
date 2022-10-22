from select import select
from selenium import webdriver
from bs4 import BeautifulSoup

driver = webdriver.Chrome('chromedriver.exe')

url = 'https://www.melon.com/chart/index.htm' 
driver.get(url)

#정리 안된 코드
html = driver.page_source
#print(html)

#정리된 코드
soup = BeautifulSoup(html, 'html.parser')
#print(soup)

#노래 차트 가져오기
songs = soup.select('tr')[1:]
#print(len(songs))
#print(songs[0])
for song in songs:
    title = song.select('div.ellipsis.rank01 > span > a')[0].text
    singer = song.select('div.ellipsis.rank02 > a')[0].text #노래 제목 갖고오기
    print(title, singer, sep='|')