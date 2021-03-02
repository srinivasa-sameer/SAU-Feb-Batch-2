import {StyleSheet} from 'react-native';
import {Colors} from 'react-native/Libraries/NewAppScreen';

export const styles = StyleSheet.create({
  container: {
    flex: 1,
    // marginTop: Constants.statusBarHeight,
    backgroundColor:'#F5FCFF'
  },
  image:{
    width:100,
    height:150
  },
  text: {
    fontSize: 42,
  },
  card:{
    flex:1,
    flexDirection:'row',
    marginBottom:4,
  },
  title:{
    fontSize:11,
    color:'black'
  },
  overview:{
    fontSize:11,
    color:'blue'
  },
  rating:{
    fontSize:11,
    color:'red'
  }
  // demo: {
  //   color: 'blue',
  //   backgroundColor: 'yellow',
  //   fontSize: 40,
  // },
  // scrollView: {
  //   backgroundColor: 'pink',
  //   marginHorizontal: 20,
  // },
  // engine: {
  //   position: 'absolute',
  //   right: 0,
  // },
  // body: {
  //   backgroundColor: Colors.white,
  // },
  // sectionContainer: {
  //   marginTop: 32,
  //   paddingHorizontal: 24,
  // },
  // sectionTitle: {
  //   fontSize: 24,
  //   fontWeight: '600',
  //   color: Colors.black,
  // },
  // sectionDescription: {
  //   marginTop: 8,
  //   fontSize: 18,
  //   fontWeight: '400',
  //   color: Colors.dark,
  // },
  // highlight: {
  //   fontWeight: '700',
  // },
  // footer: {
  //   color: Colors.dark,
  //   fontSize: 12,
  //   fontWeight: '600',
  //   padding: 4,
  //   paddingRight: 12,
  //   textAlign: 'right',
  // },
});
