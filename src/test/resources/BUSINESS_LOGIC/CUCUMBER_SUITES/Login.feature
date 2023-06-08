Feature: Login functionality

Background: User successfully lauched application
When user open "Chrome" brower with exe as "F:\\automation support\\project workspace\\Flipcart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enter url as "https://www.amazon.in"

@SmokeTest
Scenario: Login functionality with valid credentials 
When user successfully move mouse cursor on Login button
When user successfully click on profile tab under Login
When user successfully enter "harshallungse@gmail.com" as userid 
When user click on continue
When user successfully enter "azazsxsx.." as password
When user click on Login 
Then user succefully logged in with valid credentials
