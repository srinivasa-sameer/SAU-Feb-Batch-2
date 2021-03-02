import {StyleSheet} from 'react-native';
import {Colors} from 'react-native/Libraries/NewAppScreen';

export const styles = StyleSheet.create({
  container: {
    flex: 1,
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

});
