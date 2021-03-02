// import * as React from 'react';
// import { NavigationContainer } from '@react-navigation/native';
// import { createStackNavigator } from '@react-navigation/stack';
import Card from '../components/Card'
import React, { Component, PureComponent } from 'react';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { createMaterialBottomTabNavigator } from '@react-navigation/material-bottom-tabs';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import Icon from 'react-native-vector-icons/FontAwesome';
// const Stack = createStackNavigator();
import tab1 from '../screens/tabs/tab1'
import tab2 from '../screens/tabs/tab2'
import tab3 from '../screens/tabs/tab3'

// import Card from './src/components/Card/'
const mTab = createMaterialBottomTabNavigator();

function MyTabs() {
  return (
    <mTab.Navigator
      initialRouteName="tab1"
      activeColor="#C70039"
      inactiveColor="#3e2465"
      barStyle={{ 
        backgroundColor: '#DDDDDD', height:'7%', fontWeight:'bold',
        borderTopLeftRadius:15, borderTopRightRadius:15, shadowOffset:4, shadowColor:'black',
       }}
    >
      <mTab.Screen
        name="tab1"
        component={tab1}
        options={{
          tabBarLabel: 'Popular',
          tabBarIcon: ({ color, size }) => (
            <Icon name="users" size={25} color={"black"} Style={{ borderWidth:5, borderColor:'grey'}}/>
          ),
        }}
      />
      <mTab.Screen
        name="tab2"
        component={tab2}
        options={{
          tabBarLabel: 'Top Rated',
          tabBarIcon: ({ color, size }) => (
            <Icon name="star" size={27} color={"black"}/>
          ),
        }}
      />
      <mTab.Screen
        name="tab3"
        component={tab3}
        options={{
          tabBarLabel: 'Upcoming',
          tabBarIcon: ({ color, size }) => (
            <Icon name="clock-o" size={27} color={"black"}/>
          ),
        }}
      />
    </mTab.Navigator>
  );
}

const MyStack = createStackNavigator();
export class AppRoutes extends Component{
  render(){
    return (
      <NavigationContainer>
              <MyStack.Navigator 
                screenOptions={{
                  headerShown: false
                }}
                initialRouteName="Home">
                <MyStack.Screen name="Home" component={MyTabs} />
                <MyStack.Screen name="Card" component={Card} />
               </MyStack.Navigator>
             </NavigationContainer>
    );
  }
};