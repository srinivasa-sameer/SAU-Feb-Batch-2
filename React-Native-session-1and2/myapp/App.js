import React, { Component } from 'react'
import { AppRoutes } from './src/routes/AppRoutes';
export default class App extends Component {
  render() {
    return (
      <AppRoutes/>
    )
  }
}

// import React, { Component } from 'react';

// import {styles} from './styles';
// import {FlatList,Image, ScrollView,TouchableOpacity, View, Text, StatusBar, ToastAndroid} from 'react-native';
// import 'react-native-gesture-handler';
// import { NavigationContainer } from '@react-navigation/native';
// import { Icon } from 'react-native-elements'
// import {createBottomTabNavigator,createAppContainer} from 'react-navigation'
// import {createMaterialBottomTabNavigator} from 'react-navigation-material-bottom-tabs'
// // import homeStack from './src/routes/homeStack'
// import tab1 from './src/screens/tabs/tab1'
// import tab2 from './src/screens/tabs/tab2'
// import tab3 from './src/screens/tabs/tab3'

// import Card from './src/components/Card/'
// import HomeStack from './src/routes/HomeStack'

// export default class App extends Component {
  
//   render=()=> {
  
//     return (
    
//     //   <NavigationContainer>
//     //   {/* Rest of your app code */}
//     // </NavigationContainer>
//     // <Text>Home</Text>
//     <HomeStack/>
//     )
//   }
// }
// export default function App() {
//   return (
//     <HomeStack/>
//   );  
// }

// const TabNavigator=createMaterialBottomTabNavigator(
//   {
//     tab1:{
//       screen:tab1,
//       navigationOptions:{
//         tabBarLabel:'Popular',
//         activeColor:'#ff0000',
//         inactiveColor:'#000000',
//         barStyle:{backgroundColor:'#67baf6',
//         tabBarIcon:()=>{
//           <View>
//             <Icon name={'file-movie-o'} size={25} style={{color:'#ff00000'}}/>
//             {/* <Icon name="rocket" size={30} color="#900" /> */}
//           </View>
//         }
//       }
//       }
//     },
//     tab2:{
//       screen:tab2,
//       navigationOptions:{
//         tabBarLabel:'Top-rated',
//         activeColor:'#ff0000',
//         inactiveColor:'#000000',
//         barStyle:{backgroundColor:'#67baf6',
//         tabBarIcon:()=>{
//           <View>
//             <Icon name={'file-movie-o'} size={25} style={{color:'#ff00000'}}/>
//           </View>
//         }
//       }
//       }
//     },
//     tab3:{
//       screen:tab3,
//       navigationOptions:{
//         tabBarLabel:'Upcoming',
//         activeColor:'#ff0000',
//         inactiveColor:'#000000',
//         barStyle:{backgroundColor:'#67baf6',
//         tabBarIcon:()=>{
//           <View>
//             <Icon name={'file-movie-o'} size={25} style={{color:'#ff00000'}}/>
//           </View>
//         }
//       }
//       }
//     },
//   }
// );
// export default createAppContainer(TabNavigator);

// import { StatusBar } from 'expo-status-bar';
// import React from 'react';
// import { StyleSheet, Text, View } from 'react-native';

// import { AppRoutes } from './src/routes/AppRoutes';

// export default function App() {
//   return (
//     <AppRoutes/>
//   );  
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     backgroundColor: '#fff',
//     alignItems: 'center',
//     justifyContent: 'center',
//   },
// });